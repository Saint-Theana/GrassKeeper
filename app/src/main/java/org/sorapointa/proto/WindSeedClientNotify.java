package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class WindSeedClientNotify {
    public static class WindSeedClientNotify_RefreshNotify {
        @Tag(tag=13) public Integer refreshNum = null;
    }

    public static class WindSeedClientNotify_AddWindBulletNotify {
        @Tag(tag=1) public Integer seedEntityId = null;
        @Tag(tag=10) public Vector seedPos = null;
        @Tag(tag=13) public Integer catchPlayerUid = null;
    }

    public static class WindSeedClientNotify_AreaNotify {
        @Tag(tag=5) public Integer areaType = null;
        @Tag(tag=12) public Integer areaId = null;
        @Tag(tag=1) public byte[] areaCode = null;
    }

    public enum WindSeedClientNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=1114) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=11) public WindSeedClientNotify_RefreshNotify refreshNotify = null;
    @Tag(tag=8) public WindSeedClientNotify_AddWindBulletNotify addWindBulletNotify = null;
    @Tag(tag=2) public WindSeedClientNotify_AreaNotify areaNotify = null;
}
