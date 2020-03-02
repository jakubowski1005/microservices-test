import React, { Component } from 'react'
import { Navbar, NavbarBrand } from 'reactstrap'


class Header extends Component {

    state = {
        activeItem: 'home',
        isUserLoggedIn: false 
    }

    clickHandle = e => {
        this.setState({activeItem: e.target.value})
        console.log(e)
    }

    render() {
        return(
            <div>
                <Navbar color='light' light expand='md'>
                    <NavbarBrand href="/">Home</NavbarBrand>
                    
                </Navbar>
            </div>
        )
    }
}

export default Header

