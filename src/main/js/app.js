/**
 * Created by Alex on 17/04/2017.
 */
const React = require('react');
const ReactDOM = require('react-dom');
const client = require('./client');

const root = '/api';

class App extends React.Component {

    constructor(props) {
        super(props);
        this.state = {posts: [], pageSize: 2};
    }

    componentDidMount() {
        client({method: 'GET', path: '/api/posts'}).done(response => {
            this.setState({posts: response.entity._embedded.posts});
        });
    }

    render() {
        return (
            <PostList posts={this.state.posts}/>
        )
    }
}

class PostList extends React.Component{
    render() {
        var posts = this.props.posts.map(post =>
            <Post key={post._links.self.href} post={post}/>
    );
        return (
            <table>
            <tbody>
            <tr>
            <th>Title</th>
        <th>Description</th>
        </tr>
        {posts}
        </tbody>
        </table>
    )
    }
}

class Post extends React.Component{
    render() {
        return (
            <tr>
            <td>{this.props.post.title}</td>
            <td>{this.props.post.description}</td>
            </tr>
        )
    }
}

ReactDOM.render(
    <App />,
    document.getElementById('react')
)