package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ResVersionConfig.*;
import org.sorapointa.proto.ResVersionConfig;

public class DataResVersionNotify {
    public enum DataResVersionOpType {
        @Tag(tag=0) DATA_RES_VERSION_OP_TYPE_NONE ,
        @Tag(tag=1) DATA_RES_VERSION_OP_TYPE_RELOGIN ,
        @Tag(tag=2) DATA_RES_VERSION_OP_TYPE_MP_RELOGIN ;
    }

    @Tag(tag=10) public String clientSilenceMd5 = null;
    @Tag(tag=15) public String clientSilenceVersionSuffix = null;
    @Tag(tag=9) public ResVersionConfig resVersionConfig = null;
    @Tag(tag=7) public Boolean isDataNeedRelogin = null;
    @Tag(tag=12) public DataResVersionOpType opType = null;
    @Tag(tag=2) public Integer clientDataVersion = null;
    @Tag(tag=5) public String clientVersionSuffix = null;
    @Tag(tag=1) public Integer clientSilenceDataVersion = null;
    @Tag(tag=14) public String clientMd5 = null;
}
