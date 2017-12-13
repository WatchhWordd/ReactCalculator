import {Component} from 'react';
import ToastExample from './NativeMethod';
import React, {
    AppRegistry,
} from 'react-native';


class ToastModule extends Component {
    render() {
        return (
            ToastExample.showToast('Awesome', ToastExample.SHORT)
        );
    }
}

AppRegistry.registerComponent('ToastModule', () => ToastModule);