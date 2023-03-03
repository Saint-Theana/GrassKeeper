package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.PlayerHomeCompInfo.*;
import org.sorapointa.proto.PlayerHomeCompInfo;

public class PlayerHomeCompInfoNotify {
    @Tag(tag=4) public PlayerHomeCompInfo compInfo = null;
}
