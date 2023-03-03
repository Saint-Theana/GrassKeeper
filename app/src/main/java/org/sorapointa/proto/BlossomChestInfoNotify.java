package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.BlossomChestInfo.*;
import org.sorapointa.proto.BlossomChestInfo;

public class BlossomChestInfoNotify {
    @Tag(tag=9) public Integer entityId = null;
    @Tag(tag=3) public BlossomChestInfo blossomChestInfo = null;
}
