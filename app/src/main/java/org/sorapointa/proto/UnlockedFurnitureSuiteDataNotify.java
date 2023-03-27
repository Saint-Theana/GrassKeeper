package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class UnlockedFurnitureSuiteDataNotify {
    public enum UnlockedFurnitureSuiteDataNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4475) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=12) public List<Integer> furnitureSuiteIdList = new ArrayList<>();
    @Tag(tag=9) public Boolean isAll = null;
}
