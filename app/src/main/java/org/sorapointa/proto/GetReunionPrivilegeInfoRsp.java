package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ReunionPrivilegeInfo.*;
import org.sorapointa.proto.ReunionPrivilegeInfo;

public class GetReunionPrivilegeInfoRsp {
    public enum GetReunionPrivilegeInfoRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=5065) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=15,isSigned=true) public Integer retcode = null;
    @Tag(tag=14) public ReunionPrivilegeInfo privilegeInfo = null;
}
