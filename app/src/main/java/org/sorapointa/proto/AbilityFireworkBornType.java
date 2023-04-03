package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class AbilityFireworkBornType {
    @Tag(tag=8) public Vector pos = null;
    @Tag(tag=1) public Vector moveDir = null;
    @Tag(tag=2) public Integer effectIndex = null;
    @Tag(tag=12) public Vector rot = null;
}
