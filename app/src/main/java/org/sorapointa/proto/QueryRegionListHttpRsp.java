package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class QueryRegionListHttpRsp {
    @Tag(tag=1,isSigned=true) public Integer retcode = null;
    @Tag(tag=2) public List<RegionSimpleInfo> regionList = new ArrayList<>();
    @Tag(tag=5) public byte[] clientSecretKey = null;
    @Tag(tag=6) public byte[] clientCustomConfigEncrypted = null;
    @Tag(tag=7) public Boolean enableLoginPc = null;
}
