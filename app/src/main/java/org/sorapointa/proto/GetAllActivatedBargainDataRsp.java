package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.BargainSnapshot.*;
import org.sorapointa.proto.BargainSnapshot;

public class GetAllActivatedBargainDataRsp {
    public enum GetAllActivatedBargainDataRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=445) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=2) public List<BargainSnapshot> snapshotList = new ArrayList<>();
    @Tag(tag=14,isSigned=true) public Integer retcode = null;
}
