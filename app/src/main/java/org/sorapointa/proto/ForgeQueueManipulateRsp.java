package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ForgeQueueManipulateType.*;
import org.sorapointa.proto.ForgeQueueManipulateType;
import org.sorapointa.proto.ItemParam.*;
import org.sorapointa.proto.ItemParam;

public class ForgeQueueManipulateRsp {
    public enum ForgeQueueManipulateRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=636) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=3) public List<ItemParam> returnItemList = new ArrayList<>();
    @Tag(tag=7) public Integer manipulateType = null;
    @Tag(tag=13) public List<ItemParam> extraOutputItemList = new ArrayList<>();
    @Tag(tag=12) public List<ItemParam> outputItemList = new ArrayList<>();
    @Tag(tag=5,isSigned=true) public Integer retcode = null;
}
