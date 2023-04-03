package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ItemParam.*;
import org.sorapointa.proto.ItemParam;

public class BartenderGetFormulaReq {
    public enum BartenderGetFormulaReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8258) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=4) public List<ItemParam> itemList = new ArrayList<>();
    @Tag(tag=6) public Integer questId = null;
}
