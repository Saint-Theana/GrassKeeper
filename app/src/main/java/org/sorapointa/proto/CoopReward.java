package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.CoopReward_State.*;
import org.sorapointa.proto.CoopReward_State;

public class CoopReward {
    @Tag(tag=8) public Integer state = null;
    @Tag(tag=1) public Integer id = null;
}
