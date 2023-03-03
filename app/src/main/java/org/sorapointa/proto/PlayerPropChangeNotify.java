package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PlayerPropChangeNotify {
    @Tag(tag=13) public Integer propDelta = null;
    @Tag(tag=12) public Integer propType = null;
}
