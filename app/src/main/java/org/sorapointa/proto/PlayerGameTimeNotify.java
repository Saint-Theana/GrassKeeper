package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PlayerGameTimeNotify {
    @Tag(tag=7) public Integer uid = null;
    @Tag(tag=3) public Integer gameTime = null;
    @Tag(tag=13) public Boolean isHome = null;
}
