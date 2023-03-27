package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum SyncType {
        @Tag(tag=0) None ,
        @Tag(tag=1) CreateConnect ,
        @Tag(tag=2) StartGame ,
        @Tag(tag=3) Ping ,
        @Tag(tag=4) FinishGame ,
        @Tag(tag=5) SnapShot ,
        @Tag(tag=6) Action ;
}
