## 概要
-　git とjava のお勉強をしてみよう

### git ってなに？
- git は今どきの開発には絶対使うやつ
- プログラムソースの変更履歴を管理するバージョン管理システム
    - よくわからん
    - 簡単にいうとプログラムのセーブポイント的な感じ
- ググろう

### javaってなに？
- ググろう

### 使用IDE
- JavaのIDEにはVScodeを使用する
    - 最新で軽いから

## 環境構築
- 理解はできないだろうがとりあえず環境構築をしてみよう

#### git のインストール
- powershellでgitコマンドが使えればゴール
    1. windowsキーを押す
    1. `powershell`を入力してpowershellを起動する
    1. 画面上で`git`と入力
    - コマンドが見つかりませんと出たらインストールされていない
    - いろいろ出たらgit入ってる
- [このサイト](https://qiita.com/manabu-watanabe/items/ecf1b434baf305adaa00)を参考にしてgitをいれてみる
    - サイト内のチェックボックスはバージョンによってちょっと違うかも
    - サイトにはないが再起動にパスを通す的な英語のチェックボックスがあればチェックを入れる

#### git hubを使えるようにする
- [git hub](https://github.com/)にアクセスする 
    - git hubアカウントを作成する
    - sign up的なもの
    - 詳しくはググろう

- アカウントを作成したらsshで接続できるようにする
    - sshってなに？
        - よくわからんだろうから知らなくても平気
    - [このサイト](https://qiita.com/shizuma/items/2b2f873a0034839e47ce)の手順でできる

#### git cloneをする
- git cloneって？
    - いろいろセットでコピーしてくるもの
- ここまで順調に来ていればgit cloneが使えるようになっているはず
- powershell を起動して以下のコマンドを入力する
    1. mkdir pon_study
        - mkdirって何？
            - make directory の略
            - 新しいフォルダを作成するコマンド
            - pon_studyは作るフォルダの名前
    1. cd pon_study
        - cdって何
            - current directoryの略
            - 現在のフォルダを位置を変更するコマンド
            - 作成したpon_studyフォルダに移動する
    1. git clone git@github.com:yukinon1212/pon_java.git
        - なんぞこれ
            - gitコマンドで練習セット一式をコピーするコマンド
    1. 


#### VScodeの準備
- VScodeをインストールする
    - [ここから](https://azure.microsoft.com/ja-jp/products/visual-studio-code/) VScodeをインストールする
- VScodeをJavaに対応させる
    - 拡張機能 Java Extension Pack を入れるだけ
    - [ここから](https://www.suzu6.net/posts/130-vscode-for-java/)拡張機能を入れるとことjava_homeの設定を行う
        - プロジェクト作成まではやらなくていい

#### クローンしたフォルダを開く
- クローンしてきたフォルダを開く
- 何もないところで右クリック→VScodeで開く
    - VScodeが開く

- 左のサイドバーの一番上のアイコン（フォルダ一覧を表示）をクリック

- PON_JAVAの中にあるsrcフォルダがソースコードを置く場所
- App.javaが最初に開くべきHello world

