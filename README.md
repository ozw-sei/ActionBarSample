ActionBarSample
===============
 フォルダ構造


 ```
├── ActionBar.iml
├── AndroidManifest.xml
├── README.md
├── ant.properties
├── assets
├── bin
├── build.xml
├── gen
│   └── com
│       └── example
│           └── ActionBar
│               ├── BuildConfig.java
│               ├── Manifest.java
│               └── R.java
├── libs
├── local.properties
├── out
│   └── production
│       └── ActionBar
│           ├── ActionBar.apk
│           ├── ActionBar.unaligned.apk
│           └── com
│               └── example
│                   └── ActionBar
│                       ├── BuildConfig.class
│                       ├── MyActivity$1.class
│                       ├── MyActivity.class
│                       ├── R$attr.class
│                       ├── R$drawable.class
│                       ├── R$id.class
│                       ├── R$layout.class
│                       ├── R$string.class
│                       ├── R.class
│                       └── SecondScreen.class
├── proguard-project.txt
├── project.properties
├── res
│   ├── drawable-hdpi
│   │   └── ic_launcher.png
│   ├── drawable-ldpi
│   │   └── ic_launcher.png
│   ├── drawable-mdpi
│   │   └── ic_launcher.png
│   ├── layout
│   │   ├── main.xml
│   │   ├── menu.xml
│   │   └── second.xml
│   └── values
│       └── strings.xml
└── src
	   └── com
	        └── example
			            └── ActionBar
							   ├── MyActivijava
							   └── SecondScreen.java

```							   		  
							   
##注目ファイル
- AndroidManifest.xml
- SecondScreen.java

__AndroidManifest.xml__

```
16行目	android:theme="@android:style/Theme.Holo"
```

ActionBarを使うActivityであることをManifestに書きます。

__SeconcScreen.java__

22,21行目

```
//ActionBarのオブジェクトをゲット
final ActionBar actionBar = getActionBar();
//ActionBarのホーム（アプリケーションアイコン・ボタン）をTrue
actionBar.setDisplayHomeAsUpEnabled(true);
 ```

 ２６行目

 ```
 @Override
     public boolean onOptionsItemSelected(MenuItem item) {
	 	switch (item.getItemId()){
 		case android.R.id.home:
			 //ホームボタンが押された時の処理
			 finish();		
			 return true;
		}
		return super.onOptionsItemSelected(item);
	}
 ```



