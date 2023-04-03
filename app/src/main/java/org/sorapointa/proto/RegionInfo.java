package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ResVersionConfig.*;
import org.sorapointa.proto.ResVersionConfig;

public class RegionInfo {
    @Tag(tag=1) public String gateserverIp = null;
    @Tag(tag=2) public Integer gateserverPort = null;
    @Tag(tag=3) public String payCallbackUrl = null;
    @Tag(tag=7) public String areaType = null;
    @Tag(tag=8) public String resourceUrl = null;
    @Tag(tag=9) public String dataUrl = null;
    @Tag(tag=10) public String feedbackUrl = null;
    @Tag(tag=11) public String bulletinUrl = null;
    @Tag(tag=12) public String resourceUrlBak = null;
    @Tag(tag=13) public String dataUrlBak = null;
    @Tag(tag=14) public Integer clientDataVersion = null;
    @Tag(tag=16) public String handbookUrl = null;
    @Tag(tag=18) public Integer clientSilenceDataVersion = null;
    @Tag(tag=19) public String clientDataMd5 = null;
    @Tag(tag=20) public String clientSilenceDataMd5 = null;
    @Tag(tag=22) public ResVersionConfig resVersionConfig = null;
    @Tag(tag=23) public byte[] secretKey = null;
    @Tag(tag=24) public String officialCommunityUrl = null;
    @Tag(tag=26) public String clientVersionSuffix = null;
    @Tag(tag=27) public String clientSilenceVersionSuffix = null;
    @Tag(tag=28) public Boolean useGateserverDomainName = null;
    @Tag(tag=29) public String gateserverDomainName = null;
    @Tag(tag=30) public String userCenterUrl = null;
    @Tag(tag=31) public String accountBindUrl = null;
    @Tag(tag=32) public String cdkeyUrl = null;
    @Tag(tag=33) public String privacyPolicyUrl = null;
    @Tag(tag=34) public String nextResourceUrl = null;
    @Tag(tag=35) public ResVersionConfig nextResVersionConfig = null;
    @Tag(tag=36) public String gameBiz = null;
}
