package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.FurnitureMakeHelpData.*;
import org.sorapointa.proto.FurnitureMakeHelpData;

public class FurnitureMakeHelpRsp {
    public enum FurnitureMakeHelpRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4533) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=7,isSigned=true) public Integer retcode = null;
    @Tag(tag=4) public List<FurnitureMakeHelpData> helpDataList = new ArrayList<>();
}
