package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GameOver {
    @Tag(tag=4) public Integer endReason = null;
    @Tag(tag=10) public Integer winControllerId = null;
}
