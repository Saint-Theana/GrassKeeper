package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.BargainSnapshot.*;
import org.sorapointa.proto.BargainSnapshot;

public class GetBargainDataRsp {
    public enum GetBargainDataRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=473) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=14,isSigned=true) public Integer retcode = null;
    @Tag(tag=13) public BargainSnapshot snapshot = null;
    @Tag(tag=8) public Integer bargainId = null;
}
