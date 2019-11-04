
# NiceBottomBar

A lightweight Android material bottom navigation bar library

[![](https://jitpack.io/v/ibrahimsn98/NiceBottomBar.svg)](https://jitpack.io/#ibrahimsn98/NiceBottomBar)
[![API](https://img.shields.io/badge/API-16%2B-brightgreen.svg?style=flat)](https://android-arsenal.com/api?level=16)

##  GIF

<img src="https://github.com/ibrahimsn98/NiceBottomBar/blob/master/art/gif.gif?raw=true"/>

## Usage

-    Create menu.xml under your res/menu/ folder
```xml
<?xml version="1.0" encoding="utf-8"?>
<menu xmlns:android="http://schemas.android.com/apk/res/android">

	<item
		android:id="@+id/item0"
		android:title="@string/servers"
		android:icon="@drawable/ic_dns_black_24dp" />

	<item
		android:id="@+id/item1"
		android:title="@string/search"
		android:icon="@drawable/ic_search_black_24dp" />

	<item
		android:id="@+id/item2"
		android:title="@string/billing"
		android:icon="@drawable/ic_receipt_black_24dp" />

	<item
		android:id="@+id/item3"
		android:title="@string/account"
		android:icon="@drawable/ic_account_circle_black_24dp" />
    
</menu>
```


- Add view into your layout file
```xml
<me.ibrahimsn.lib.NiceBottomBar
	android:id="@+id/bottomBar"
	android:layout_width="match_parent"
	android:layout_height="60dp"
	app:menu="@menu/bottom_menu" />
```


- Use NiceBottomBar functions in your activity
```kotlin
bottomBar.setActiveItem(1)
bottomBar.setBadge(2)
bottomBar.removeBadge(2)

bottomBar.onItemSelected = {
    status.text = "Item $it selected"
}

bottomBar.onItemReselected = {
    status.text = "Item $it re-selected"
}

bottomBar.onItemLongClick = {
    status.text = "Item $it long click"
}
```


## Customization

```xml
<me.ibrahimsn.lib.NiceBottomBar
	android:id="@+id/bottomBar"
	android:layout_width="match_parent"
	android:layout_height="60dp"
	app:menu="@menu/bottom_menu"
	app:backgroundColor=""
	app:indicatorEnabled=""
	app:indicatorColor=""
	app:indicatorWidth=""
	app:indicatorGravity=""
	app:itemFontFamily=""
	app:textColor=""
	app:textColorActive=""
	app:textSize=""
	app:iconSize=""
	app:iconMargin=""
	app:activeItem=""
	app:badgeColor=""
	app:indicatorInterpolator="anticipateOvershoot" />
```


## Setup

```gradle
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}

dependencies {
        implementation 'com.github.ibrahimsn98:NiceBottomBar:2.2'
}
```


## License

```
MIT License

Copyright (c) 2019 İbrahim Süren

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```


> Follow me on Twitter [@ibrahimsn98](https://twitter.com/ibrahimsn98)