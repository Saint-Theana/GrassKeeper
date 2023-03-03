package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class WindSeedClientNotify {
    public static class RefreshNotify {
        @Tag(tag=9) public Integer refreshNum = null;
    }

    public static class AddWindBulletNotify {
        @Tag(tag=6) public Vector seedPos = null;
        @Tag(tag=8) public Integer catchPlayerUid = null;
        @Tag(tag=7) public Integer seedEntityId = null;
    }

    public static class AreaNotify {
        @Tag(tag=5) public byte[] areaCode = null;
        @Tag(tag=10) public Integer areaId = null;
        @Tag(tag=7) public Integer areaType = null;
    }

    @Tag(tag=14) public RefreshNotify refreshNotify = null;
    @Tag(tag=6) public AddWindBulletNotify addWindBulletNotify = null;
    @Tag(tag=4) public AreaNotify areaNotify = null;
}
