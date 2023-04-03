package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class AbilityActionGenerateElemBall {
    @Tag(tag=7) public Vector pos = null;
    @Tag(tag=6) public Integer roomId = null;
    @Tag(tag=15) public Vector rot = null;
}
