import {StackNavigator} from 'react-navigation';
import {Component} from 'react';
import {AppRegistry, Button} from 'react-native';


class MyHomeScreen extends Component {
    static navigationOptions = {
        title: 'Welcome',
    };

    render() {
        const {navigate} = this.props.navigation;
        return (
            <Button
                title="Go to Jane's profile"
                onPress={() =>
                    navigate('Profile', {name: 'Jane'})
                }
            />
        );
    }
}

// const HomeScreen = () => (
//     <View style={{flex: 1, alignItems: 'center', justifyContent: 'center'}}>
//         <Text>Home Screen</Text>
//         <Button
//             onPress={() => navigation.navigate('Details')}
//             title="Go to details"
//         />
//     </View>
// );
//
// const DetailsScreen = () => (
//     <View style={{flex: 1, alignItems: 'center', justifyContent: 'center'}}>
//         <Text>Details Screen</Text>
//     </View>
// );
//
// const RootNavigator = new StackNavigator({
//     Home: {
//         screen: HomeScreen,
//         navigationOptions: {
//             headerTitle: 'Home',
//         },
//     },
//     Details: {
//         screen: DetailsScreen,
//         navigationOptions: {
//             headerTitle: 'Details',
//         },
//     },
// });

AppRegistry.registerComponent('MyHomeScreen',()=>MyHomeScreen);
