package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.SyncType.*;
import org.sorapointa.proto.SyncType;
import org.sorapointa.proto.SyncCreateConnect.*;
import org.sorapointa.proto.SyncCreateConnect;
import org.sorapointa.proto.SyncPing.*;
import org.sorapointa.proto.SyncPing;
import org.sorapointa.proto.SyncFinishGame.*;
import org.sorapointa.proto.SyncFinishGame;
import org.sorapointa.proto.SyncSnapShot.*;
import org.sorapointa.proto.SyncSnapShot;
import org.sorapointa.proto.SyncAction.*;
import org.sorapointa.proto.SyncAction;

public class AbilityMixinBreakout {
    @Tag(tag=13,isSigned=true) public Integer retcode = null;
    @Tag(tag=3) public Integer syncType = null;
    @Tag(tag=14) public SyncCreateConnect syncCreateConnect = null;
    @Tag(tag=4) public SyncPing syncPing = null;
    @Tag(tag=7) public SyncFinishGame syncFinishGame = null;
    @Tag(tag=10) public SyncSnapShot syncSnapShot = null;
    @Tag(tag=12) public SyncAction syncAction = null;
}
