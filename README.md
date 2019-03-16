
# NiceBottomBar
A lightweight Android material bottom navigation bar library

[![](https://jitpack.io/v/ibrahimsn98/NiceBottomBar.svg)](https://jitpack.io/#ibrahimsn98/NiceBottomBar)

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

	bottomBar.setBottomBarCallback(object: NiceBottomBar.BottomBarCallback {
		override fun onItemSelect(pos: Int) {

		}

		override fun onItemReselect(pos: Int) {

		}
	})
```

## Customization
```xml
	<me.ibrahimsn.lib.NiceBottomBar
		android:id="@+id/bottomBar"
		android:layout_width="match_parent"
		android:layout_height="60dp"
		app:menu="@menu/bottom_menu"
		app:backgroundColor=""
		app:indicatorColor=""
		app:indicatorWidth=""
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
	        implementation 'com.github.ibrahimsn98:NiceBottomBar:1.3'
	}
```
