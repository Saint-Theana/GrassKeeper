package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Reward.*;
import org.sorapointa.proto.Reward;

public class GrantRewardNotify {
    @Tag(tag=6) public Reward reward = null;
}
