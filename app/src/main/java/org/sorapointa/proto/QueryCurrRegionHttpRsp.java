package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ForceUpdateInfo.*;
import org.sorapointa.proto.ForceUpdateInfo;
import org.sorapointa.proto.RegionInfo.*;
import org.sorapointa.proto.RegionInfo;
import org.sorapointa.proto.StopServerInfo.*;
import org.sorapointa.proto.StopServerInfo;

public class QueryCurrRegionHttpRsp {
    @Tag(tag=1,isSigned=true) public Integer retcode = null;
    @Tag(tag=2) public String msg = null;
    @Tag(tag=3) public RegionInfo regionInfo = null;
    @Tag(tag=11) public byte[] clientSecretKey = null;
    @Tag(tag=12) public byte[] regionCustomConfigEncrypted = null;
    @Tag(tag=13) public byte[] clientRegionCustomConfigEncrypted = null;
    @Tag(tag=4) public ForceUpdateInfo forceUpdate = null;
    @Tag(tag=5) public StopServerInfo stopServer = null;
}
