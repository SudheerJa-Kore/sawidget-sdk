# Kore Widget SDK

This Android project contains the `widgetsdk` library and a small `app` module that demonstrates consuming the library as a JitPack dependency.

The SDK is optional for customer apps. Add it only when the widget UI is needed.

## Use from JitPack

Add JitPack to the repositories in your Android project:

```gradle
maven { url 'https://jitpack.io' }
```

Then add the SDK dependency using a published Git tag:

```gradle
implementation 'com.github.SudheerJa-Kore:sawidget-sdk:<version>'
```

Replace `<version>` with the release tag published from this repository. The included demo app uses this dependency form.
