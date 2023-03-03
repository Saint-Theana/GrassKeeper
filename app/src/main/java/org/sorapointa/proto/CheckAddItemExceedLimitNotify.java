package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class CheckAddItemExceedLimitNotify {
    public enum ItemExceedLimitMsgType {
        @Tag(tag=0) ITEM_EXCEED_LIMIT_MSG_TYPE_DEFAULT ,
        @Tag(tag=1) ITEM_EXCEED_LIMIT_MSG_TYPE_TEXT ,
        @Tag(tag=2) ITEM_EXCEED_LIMIT_MSG_TYPE_DIALOG ,
        @Tag(tag=3) ITEM_EXCEED_LIMIT_MSG_TYPE_DIALOG_NONBLOCK ;
    }

    @Tag(tag=5) public Boolean isDrop = null;
    @Tag(tag=4) public ItemExceedLimitMsgType msgType = null;
    @Tag(tag=10) public List<Integer> exceededItemTypeList = new ArrayList<>();
    @Tag(tag=12) public List<Integer> exceededItemList = new ArrayList<>();
    @Tag(tag=14) public Integer reason = null;
}
