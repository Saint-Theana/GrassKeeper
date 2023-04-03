package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.CoopPoint_State.*;
import org.sorapointa.proto.CoopPoint_State;

public class CoopPoint {
    @Tag(tag=10) public Integer id = null;
    @Tag(tag=5) public Integer state = null;
    @Tag(tag=15) public Integer selfConfidence = null;
}
