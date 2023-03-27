package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class CheckAddItemExceedLimitNotify {
    public enum CheckAddItemExceedLimitNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=634) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=15) public List<Integer> exceededItemTypeList = new ArrayList<>();
    @Tag(tag=5) public List<Integer> exceededItemList = new ArrayList<>();
    @Tag(tag=2) public Integer reason = null;
    @Tag(tag=7) public Integer msgType = null;
    @Tag(tag=1) public Boolean isDrop = null;
}
