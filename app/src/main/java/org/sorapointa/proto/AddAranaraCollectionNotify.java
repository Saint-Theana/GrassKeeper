package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AddAranaraCollectionNotify {
    public enum DCJEFDEAHBE {
        @Tag(tag=0) None ,
        @Tag(tag=6395) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=10) public Integer fromState = null;
    @Tag(tag=15) public Integer targetState = null;
    @Tag(tag=1) public Integer collectionId = null;
    @Tag(tag=5) public Integer collectionType = null;
}
