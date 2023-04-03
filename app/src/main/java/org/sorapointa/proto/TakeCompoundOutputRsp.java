package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ItemParam.*;
import org.sorapointa.proto.ItemParam;

public class TakeCompoundOutputRsp {
    public enum TakeCompoundOutputRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=143) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=13) public List<ItemParam> itemList = new ArrayList<>();
    @Tag(tag=2,isSigned=true) public Integer retcode = null;
}
