import React, {Component} from 'react';
import {
    AppRegistry,
    View,
    Text
} from 'react-native';
import Style from './Style';

class Greeting extends Component {
    render() {
        return (
            <Text> {this.props.name}</Text>
        );
    }
}

class LotsOfGreetings extends Component {

    render() {
        return (
            <View style={Style.GreetingPosition}>
                <Greeting name='Rexxar'/>
                <Greeting name='Jaina'/>
                <Greeting name='Valeera'/>
            </View>
        )
    }
}

AppRegistry.registerComponent("LotsOfGreetings", () => LotsOfGreetings);