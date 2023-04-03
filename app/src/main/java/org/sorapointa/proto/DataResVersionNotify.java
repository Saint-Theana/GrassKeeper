package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ResVersionConfig.*;
import org.sorapointa.proto.ResVersionConfig;
import org.sorapointa.proto.DataResVersionNotify_DataResVersionOpType.*;
import org.sorapointa.proto.DataResVersionNotify_DataResVersionOpType;

public class DataResVersionNotify {
    public enum DataResVersionNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=164) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=12) public String clientSilenceMd5 = null;
    @Tag(tag=1) public String clientMd5 = null;
    @Tag(tag=3) public Integer clientDataVersion = null;
    @Tag(tag=15) public String clientSilenceVersionSuffix = null;
    @Tag(tag=7) public ResVersionConfig resVersionConfig = null;
    @Tag(tag=6) public Boolean isDataNeedRelogin = null;
    @Tag(tag=5) public Integer clientSilenceDataVersion = null;
    @Tag(tag=14) public Integer opType = null;
    @Tag(tag=8) public String clientVersionSuffix = null;
}
