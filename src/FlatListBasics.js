import React, {Component} from 'react';
import {AppRegistry,FlatList, Text, View} from 'react-native';
import Style from './Style';

class FlatListBasics extends Component {
    render() {
        return (
            <View style={Style.flatContainer}>
                <FlatList
                    data={[
                        {key: 'Devin'},
                        {key: 'Jackson'},
                        {key: 'James'},
                        {key: 'Joel'},
                        {key: 'John'},
                        {key: 'Jillian'},
                        {key: 'Jimmy'},
                        {key: 'Julie'},
                    ]}/>
                renderItem={({item}) => <Text style={Style.flatItem}>{item.key}</Text>}
            </View>
        )
    }
}

AppRegistry.registerComponent('FlatListBasics',()=>FlatListBasics);
