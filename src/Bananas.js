import React, {Component} from 'react';

import {
    Image,
    AppRegistry

} from 'react-native';

import Style from './Style'

class Bananas extends Component {

    render() {
        let pic = {
            uri: 'https://upload.wikimedia.org/wikipedia/commons/d/de/Bananavarieties.jpg'
        };
        return (
            <Image source={pic} style={Style.imagePosition}></Image>
        );
    }
}

AppRegistry.registerComponent('Bananas', () => Bananas);