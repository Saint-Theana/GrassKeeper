package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.IrodoriChessPlayerInfo.*;
import org.sorapointa.proto.IrodoriChessPlayerInfo;

public class IrodoriChessPlayerInfoNotify {
    @Tag(tag=6) public IrodoriChessPlayerInfo playerInfo = null;
}
