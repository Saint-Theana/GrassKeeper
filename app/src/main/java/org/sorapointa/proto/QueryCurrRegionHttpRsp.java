package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class QueryCurrRegionHttpRsp {
    @Tag(tag=1,isSigned=true) public Integer retcode = null;
    @Tag(tag=2) public String msg = null;
    @Tag(tag=3) public RegionInfo regionInfo = null;
    @Tag(tag=4) public ForceUdpate forceUdpate = null;
    @Tag(tag=5) public StopServer stopServer = null;
    @Tag(tag=11) public byte[] clientSecretKey = null;
    @Tag(tag=12) public byte[] regionCustomConfigEncrypted = null;
    @Tag(tag=13) public byte[] clientRegionCustomConfigEncrypted = null;
}
