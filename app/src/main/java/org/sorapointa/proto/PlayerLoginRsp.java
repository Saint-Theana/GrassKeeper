package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.BlockInfo.*;
import org.sorapointa.proto.BlockInfo;
import org.sorapointa.proto.FeatureBlockInfo.*;
import org.sorapointa.proto.FeatureBlockInfo;
import org.sorapointa.proto.ResVersionConfig.*;
import org.sorapointa.proto.ResVersionConfig;
import org.sorapointa.proto.ShortAbilityHashPair.*;
import org.sorapointa.proto.ShortAbilityHashPair;

public class PlayerLoginRsp {
    public static class MapBlockInfoMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public BlockInfo value = null;
    }

    public static class MapAbilityHashMap {
        @Tag(tag=1) public String key = null;
        @Tag(tag=2,isSigned=true) public Integer value = null;
    }

    @Tag(tag=1) public Integer clientDataVersion = null;
    @Tag(tag=1429) public Boolean isScOpen = null;
    @Tag(tag=15,isSigned=true) public Integer retcode = null;
    @Tag(tag=571) public List<MapBlockInfoMap> blockInfoMap = new ArrayList<>();
    @Tag(tag=1685) public Boolean isAudit = null;
    @Tag(tag=2018) public Boolean isTransfer = null;
    @Tag(tag=1746) public String clientSilenceMd5 = null;
    @Tag(tag=1573) public ResVersionConfig nextResVersionConfig = null;
    @Tag(tag=6) public Integer clientSilenceDataVersion = null;
    @Tag(tag=4) public Long loginRand = null;
    @Tag(tag=8) public Boolean isNewPlayer = null;
    @Tag(tag=1047) public String clientVersionSuffix = null;
    @Tag(tag=5) public String gameBiz = null;
    @Tag(tag=621) public String nextResourceUrl = null;
    @Tag(tag=10) public Boolean isRelogin = null;
    @Tag(tag=125,isFloat=true) public Double totalTickTime = null;
    @Tag(tag=932) public Boolean isEnableClientHashDebug = null;
    @Tag(tag=2024) public byte[] scInfo = null;
    @Tag(tag=12,isSigned=true) public Integer abilityHashCode = null;
    @Tag(tag=2040) public String registerCps = null;
    @Tag(tag=1649) public Boolean isLoginRspSplit = null;
    @Tag(tag=2) public Boolean isUseAbilityHash = null;
    @Tag(tag=11) public List<MapAbilityHashMap> abilityHashMap = new ArrayList<>();
    @Tag(tag=250) public List<ShortAbilityHashPair> shortAbilityHashMap = new ArrayList<>();
    @Tag(tag=1830) public String clientMd5 = null;
    @Tag(tag=1900) public String countryCode = null;
    @Tag(tag=951) public Boolean isDataNeedRelogin = null;
    @Tag(tag=1969) public ResVersionConfig resVersionConfig = null;
    @Tag(tag=1352) public List<FeatureBlockInfo> featureBlockInfoList = new ArrayList<>();
    @Tag(tag=624) public String birthday = null;
    @Tag(tag=14) public Integer targetUid = null;
    @Tag(tag=13) public byte[] playerData = null;
    @Tag(tag=1299) public String clientSilenceVersionSuffix = null;
    @Tag(tag=553) public Integer targetHomeOwnerUid = null;
    @Tag(tag=7) public Integer playerDataVersion = null;
}
