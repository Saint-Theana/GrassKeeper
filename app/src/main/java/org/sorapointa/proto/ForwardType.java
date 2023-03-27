package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum ForwardType {
        @Tag(tag=0) ForwardLocal ,
        @Tag(tag=1) ForwardToAll ,
        @Tag(tag=2) ForwardToAllExceptCur ,
        @Tag(tag=3) ForwardToHost ,
        @Tag(tag=4) ForwardToAllGuest ,
        @Tag(tag=5) ForwardToPeer ,
        @Tag(tag=6) ForwardToPeers ,
        @Tag(tag=7) ForwardOnlyServer ,
        @Tag(tag=8) ForwardToAllExistExceptCur ;
}
