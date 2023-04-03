package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ItemParam.*;
import org.sorapointa.proto.ItemParam;

public class PlayerRandomCookReq {
    public enum PlayerRandomCookReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=173) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=2) public List<ItemParam> materialList = new ArrayList<>();
}
