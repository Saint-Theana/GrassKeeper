package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class HomeVerifyBlockData {
    @Tag(tag=10) public Integer blockId = null;
    @Tag(tag=9) public Integer furnitureCount = null;
}
