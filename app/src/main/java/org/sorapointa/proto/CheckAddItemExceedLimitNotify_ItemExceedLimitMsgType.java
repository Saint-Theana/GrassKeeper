package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum CheckAddItemExceedLimitNotify_ItemExceedLimitMsgType {
        @Tag(tag=0) ItemExceedLimitMsgDefault ,
        @Tag(tag=1) ItemExceedLimitMsgText ,
        @Tag(tag=2) ItemExceedLimitMsgDialog ,
        @Tag(tag=3) ItemExceedLimitMsgDialogNonblock ;
}
