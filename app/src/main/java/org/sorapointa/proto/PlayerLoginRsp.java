package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ResVersionConfig.*;
import org.sorapointa.proto.ResVersionConfig;
import org.sorapointa.proto.FeatureBlockInfo.*;
import org.sorapointa.proto.FeatureBlockInfo;
import org.sorapointa.proto.BlockInfo.*;
import org.sorapointa.proto.BlockInfo;
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

    public enum PlayerLoginRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=198) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=201) public Boolean isAudit = null;
    @Tag(tag=6) public Boolean isRelogin = null;
    @Tag(tag=1070) public String clientMd5 = null;
    @Tag(tag=9) public Integer playerDataVersion = null;
    @Tag(tag=624) public String clientVersionSuffix = null;
    @Tag(tag=8) public Long loginRand = null;
    @Tag(tag=2035) public List<FeatureBlockInfo> featureBlockInfoList = new ArrayList<>();
    @Tag(tag=15) public Boolean isUseAbilityHash = null;
    @Tag(tag=1852) public Boolean isScOpen = null;
    @Tag(tag=14) public byte[] playerData = null;
    @Tag(tag=1769,isFloat=true) public Double totalTickTime = null;
    @Tag(tag=982) public List<MapBlockInfoMap> blockInfoMap = new ArrayList<>();
    @Tag(tag=238) public String countryCode = null;
    @Tag(tag=777) public ResVersionConfig resVersionConfig = null;
    @Tag(tag=2) public Integer clientSilenceDataVersion = null;
    @Tag(tag=935) public String clientSilenceVersionSuffix = null;
    @Tag(tag=1254) public Boolean isEnableClientHashDebug = null;
    @Tag(tag=979) public String clientSilenceMd5 = null;
    @Tag(tag=1021) public Boolean isDataNeedRelogin = null;
    @Tag(tag=1199) public List<ShortAbilityHashPair> shortAbilityHashMap = new ArrayList<>();
    @Tag(tag=3) public Integer targetUid = null;
    @Tag(tag=4) public String gameBiz = null;
    @Tag(tag=956) public Boolean isTransfer = null;
    @Tag(tag=1,isSigned=true) public Integer retcode = null;
    @Tag(tag=5) public List<MapAbilityHashMap> abilityHashMap = new ArrayList<>();
    @Tag(tag=1435) public Boolean isLoginRspSplit = null;
    @Tag(tag=151) public byte[] scInfo = null;
    @Tag(tag=10) public Boolean isNewPlayer = null;
    @Tag(tag=7) public Integer clientDataVersion = null;
    @Tag(tag=787) public Integer targetHomeOwnerUid = null;
    @Tag(tag=552) public String registerCps = null;
    @Tag(tag=163) public String birthday = null;
    @Tag(tag=1331) public ResVersionConfig nextResVersionConfig = null;
    @Tag(tag=13,isSigned=true) public Integer abilityHashCode = null;
    @Tag(tag=1095) public String nextResourceUrl = null;
}
