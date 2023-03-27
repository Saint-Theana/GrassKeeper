package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum ServerBuffChangeNotify_ServerBuffChangeType {
        @Tag(tag=0) AddServerBuff ,
        @Tag(tag=1) DelServerBuff ;
}
