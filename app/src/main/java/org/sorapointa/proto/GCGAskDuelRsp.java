package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.GCGDuel.*;
import org.sorapointa.proto.GCGDuel;

public class GCGAskDuelRsp {
    @Tag(tag=3,isSigned=true) public Integer retcode = null;
    @Tag(tag=13) public GCGDuel duel = null;
}
