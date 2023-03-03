package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ChessPlayerInfo.*;
import org.sorapointa.proto.ChessPlayerInfo;

public class ChessPlayerInfoNotify {
    @Tag(tag=10) public ChessPlayerInfo playerInfo = null;
}
