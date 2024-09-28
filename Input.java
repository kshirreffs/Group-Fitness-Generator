
/**
 * Where all poses and meditations are uploaded to PoseOrganizer
 */
public class Input {
  
  public static void inputAll() {
    
    MeditationOrganizer.clear();
    PoseOrganizer.clear();
    
    // YOGA
    
    // *Spine stretches*
    YogaPose standingLatFlexion = new YogaPose("Standing Lateral Flexion", 
        "Start in Mountain./"
        + "Raise one arm overhead, keeping both sides of body long. Shoulders stay down. "
        + "Press into the floor with the same foot as lifted arm./"
        + "I raise arm, E lower/"
        + "Regression: perform forward fold.",
        StartingPosition.STANDING, PoseIntensity.BEGINNER, false, false, false,
        true);
    
    YogaPose threadNeedle = new YogaPose("Threading the Needle", 
        "Start in all fours twist torso to lift the arm, gaze follows./"
        + "Hinge at hips to thread the arm under the torso, head and shoulder come to the mat. /"
        + "I twist and lift, E thread/"
        + "Variation: dynamic threading the needle (good for warmup); "
        + "non-threading arm is extended or bound (good for deep stretch).",
        StartingPosition.ALLFOURS, PoseIntensity.BEGINNER, true, false, true,
        true);
    
    YogaPose catCow = new YogaPose("Cat-Cow Stretch", 
        "Start in all fours./"
        + "Cat: engage core to round back upward (starting at the tailbone), gaze towards navel. "
        + "Abs lift towards the spine.\n"
        + "Cow: Extend the spine, starting at the tailbone. Elongate upward and forward while maintaining "
        + "ab engagement to protect lower back./"
        + "E Cat, I Cow/"
        + "Progression: combine cat-cow exercise with spinal balance.",
        StartingPosition.ALLFOURS, PoseIntensity.BEGINNER, false, false, false,
        true);
    
    // *Work out*
    YogaPose crescent = new YogaPose("Crescent lunge", 
        "Front knee over front ankle, back heel towards the ceiling. Hips square to the front of the room. Hands heart center./"
        + "Engaging through quads and core. Posterior pelvic tilt to enhance hip flexor stretch//"
        + "Progression: arms extend overhead, shoulders down",
        StartingPosition.STANDING, PoseIntensity.BEGINNER, true, true, false,
        false);
    
    YogaPose revolvedCrescent = new YogaPose("Revolving Crescent lunge", 
        "Start in crescent lunge./"
        + "Tilt forward to create straight line from head to back heel. Rotate torso towards front leg",
        StartingPosition.STANDING, PoseIntensity.INTERMEDIATE, true, true, false,
        false);
    
    YogaPose deepCrescent = new YogaPose("Deep Crescent lunge", 
        "Front knee over front ankle, back heel towards the ceiling. Hips square to the front of the room. Hands heart center./"
        + "Lower back knee to mat//"
        + "Progression: arms extend overhead, shoulders down",
        StartingPosition.STANDING, PoseIntensity.BEGINNER, true, true, false,
        false);
    
    YogaPose threeLeggedDog = new YogaPose("Three Legged Dog", 
        "Start in down dog./"
        + "Lift one leg upwards. Hips stay square to ground.//"
        + "Variation: make dynamic, draw knee towards chest then lift behind.",
        StartingPosition.ALLFOURS, PoseIntensity.BEGINNER, true, false, false,
        false);
    
    YogaPose airplane = new YogaPose("Airplane", 
        "Start in Mountain, knees bent slightly./"
        + "Hinge forward at the hips, maintaining a neutral spine until back is paralell to the floor. "
        + "Engage core to support lower back//"
        + "Regression: hands on thighs; Progression: arms extend to sides of room",
        StartingPosition.STANDING, PoseIntensity.BEGINNER, true, true, false,
        false);
    
    YogaPose wideLeggedAirplane = new YogaPose("Wide-legged Airplane", 
        "From Warrior 2, extend front leg, shift toes to face long-edge of mat./"
        + "Hands heart-center, maintain neutral spine to hinge forward at the hips//"
        + "Progression: arms extend to sides of room",
        StartingPosition.STANDING, PoseIntensity.BEGINNER, true, true, false,
        false);
    
    YogaPose halfMoon = new YogaPose("Balancing Half Moon", 
        "Start in Warrior 2, Triangle, or Extended Side Angle (or Warrior 3)./"
        + "Shight weight onto front leg while simultaneously raising back leg parallel to floor. "
        + "Gradually straighten front leg (keep gentle bend). Extend arms to ceiling and floor. "
        + "Head in line with spine, lengthen from crown of head to heel of lifted leg.//"
        + "Regression: place bottom hand on a yoga block; Progression: fingertips touching the floor",
        StartingPosition.STANDING, PoseIntensity.INTERMEDIATE, true, true, false,
        false);
    
    YogaPose chair = new YogaPose("Chair", 
        "Start in Mountain. Bend the knees, sit hips down and back./"
        + "Knees in line with toes. Chest stays open, spine neutral, abs engaged. Avoid knees collapsing in.//"
        + "Regression: hands on thighs; Progression: arms reach up, creating straight line from tailbone to fingers",
        StartingPosition.STANDING, PoseIntensity.BEGINNER, false, true, false,
        false);
    
    YogaPose balancingChair = new YogaPose("Balancing Chair", 
        "Start in chair./"
        + "Lift heels upward off the floor. Knees stay behind toes. Continue to breathe",
        StartingPosition.STANDING, PoseIntensity.INTERMEDIATE, false, false, false,
        false);
    
    YogaPose revolvingChair = new YogaPose("Revolving Chair", 
        "Start in chair, arms at heart-center./"
        + "Rotate torso from the belly button up. Keep hips squared to the front.",
        StartingPosition.STANDING, PoseIntensity.INTERMEDIATE, true, true, false,
        false);
    
    YogaPose standingLegBalance = new YogaPose("Standing Leg Balance", 
        "Start in Mountain./"
        + "Shift weight into standing leg while bringing other knee towards chest. "
        + "Wrap corresponding hand around bent knee//"
        + "Progression: Grip big toe with pointer and middle finger. Extend leg forward, "
        + "straightening knee as much as possible without locking the knee; "
        + "Variation: Open lifted knee to the side",
        StartingPosition.STANDING, PoseIntensity.BEGINNER, true, true, false,
        false);
    
    YogaPose dancer = new YogaPose("Dancer", 
        "Start in Mountain./"
        + "Shift weight into standing leg. Extend back leg behind, toes pointed. "
        + "Bend the leg and bring the heel toward the glutes. Reach corresponding hand down to grasp the outside of the foot."
        + "Abs engaged to prevent arching the lower back. Hips stay squared to the front. "
        + "Oppositional force between back foot and palm. Extend front arm overhead.",
        StartingPosition.STANDING, PoseIntensity.INTERMEDIATE, true, false, false,
        false);
    
    YogaPose eagle = new YogaPose("Eagle", 
        "Start in Mountain./"
        + "Balance on standing leg, wrap other leg around. Cross [wrapped leg] arm-elbow under other arm-elbow. "
        + "Lift elbows up away from chest. Hinge at hips, bend standing knee to lower into a mini-squat//"
        + "Regression: Foot of wrapped leg can touch floor; use heart-center arm position; stay upright, don't lower; "
        + "Progression: Wrap arms with palms pressed together; hook top of wrapping foot behind standing leg's calf",
        StartingPosition.STANDING, PoseIntensity.BEGINNER, true, false, false,
        false);
    
    YogaPose extendedSideAngle = new YogaPose("Extended Side Angle", 
        "Start in Warrior 2./"
        + "Reach front arm out, tilt upper body towards front leg. Gently place front forearm on the front thigh. "
        + "Create diagonal line with torso, chest lifted. Reach back arm upward to the sky.//"
        + "Regression: Place front arm on front thigh; Progression: Reach top arm on a diagonal, "
        + "creating straight line from fingers to heel, "
        + "place bottom hand down on the floor in front of the foot; "
        + "Extend bottom arm out in front of the body; "
        + "Bound angle pose",
        StartingPosition.STANDING, PoseIntensity.BEGINNER, true, true, false,
        false);
    
    YogaPose gorilla = new YogaPose("Gorilla", 
        "Start in a forward fold position./"
        + "Place fingers (palms up) under the toes or wrap index finger around big toe./"
        + "Add movement by I to straighten back to neutral, E to return to starting position./"
        + "Regression: perform forward fold.",
        StartingPosition.STANDING, PoseIntensity.BEGINNER, false, false, false,
        false);
    
    YogaPose pyramid = new YogaPose("Pyramid", 
        "Start in crescent lunge. Narrow stance, toes pointing forward, hips squared to front./"
        + "Extend front leg without locking the knee. Hinge forward at hips while maintaining neutral spine.//"
        + "Regression: gently place hands on front thigh (don't rest weight); "
        + "Progression: arms extended overhead; bounded arms; fingertips to floor; round into forward fold",
        StartingPosition.STANDING, PoseIntensity.BEGINNER, true, true, false,
        false);
    
    YogaPose reverseWarrior = new YogaPose("Reverse Warrior", 
        "Start in crescent lunge./"
        + "Lengthen torso to reach front arm upwards, reach back arms down along the back leg. "
        + "Lower body anchors while upper body lifts and reaches upward. Avoid tailbone sticking out.//"
        + "Progression: place back of back hand on lower back; bring back arm behind the back, reaching for front thigh; "
        + "Variation: Reverse Warrior --> W2 --> Extended Side Angle flow",
        StartingPosition.STANDING, PoseIntensity.BEGINNER, true, false, false,
        false);
    
    YogaPose standingChestExpansion = new YogaPose("Standing Chest Expansion", 
        "From Mountain, interlace hands behind back./"
        + "Lift chest to straighten and lift arms, avoiding arching in the back.//"
        + "Progression: Fold forward with slight bend in knees.",
        StartingPosition.STANDING, PoseIntensity.BEGINNER, false, false, false,
        false);
    
    YogaPose sunflower = new YogaPose("Sunflower", 
        "Start in a wide stance with feet turned outward. Knees pointing in same direction as feet./"
        + "Sweep arms up. Bend knees into deep plie squat, arms move to 90 degrees at shoulder height. "
        + "Hinge forward from the hips with a flat back to lower arms and scoop the ground./"
        + "I sweep arms up, E squat, hinge, and scoop. I reverse movement.",
        StartingPosition.STANDING, PoseIntensity.BEGINNER, false, true, false,
        false);
    
    YogaPose tree = new YogaPose("Tree", 
        "From mountain, shift weight to balance on standing leg./"
        + "Turn out other leg, bring this foot to inner calf or thigh, avoiding the knee. "
        + "Hips stay level and squared to the front, arms extended overhead.//"
        + "Regression: keep toes on the ground, place foot on the standing ankle; arms at hips or heart-center",
        StartingPosition.STANDING, PoseIntensity.BEGINNER, true, true, false,
        false);
    
    YogaPose triangle = new YogaPose("Triangle", 
        "From Warrior 2, slightly narrow stance. Straighten front leg without locking the knee./"
        + "Extend arms at shoulder height. Engage core to reach torso forward, tilting towards front leg."
        + "Front arm on front thigh or shin for light support. Top arms reaches for the ceiling. "
        + "Gaze towards top arm. Body stays in one plane.//"
        + "Regression: partial tilt; hand on block; Progression: extend arms to frame the head; revolved triangle",
        StartingPosition.STANDING, PoseIntensity.BEGINNER, true, true, false,
        false);
    
    YogaPose revolvedTriangle = new YogaPose("Revolved Triangle", 
        "From pyramid, engage core to rotate torso towards front leg, while maintaining neutral spine./"
        + "Place opposite arm on front thigh or on the floor outside the foot. Reach other arm towards the sky.//"
        + "Regression: hand on block",
        StartingPosition.STANDING, PoseIntensity.INTERMEDIATE, true, false, false,
        false);
    
    YogaPose warrior1 = new YogaPose("Warrior 1", 
        "From Mountain, step back into a lunge, back leg with a soft bend./"
        + "Front knee directly over ankle, hips squared to front. Turn back foot outward 45 degrees. "
        + "Press through outer edge of back foot. Lift arms overhead, spine long.//"
        + "Regression: Hands on hips or heart-center; Progression: Arms overhead with palms together",
        StartingPosition.STANDING, PoseIntensity.BEGINNER, true, true, false,
        false);
    
    YogaPose warrior2 = new YogaPose("Warrior 2", 
        "From Crescent lunge, spin back foot down, open hips to the side of the room. "
        + "Heel of front foot in line with the arch of the back foot./"
        + "Press outer edge of back foot into the mat. Arms extend at should height, reaching in opposite directions. "
        + "If notice front knee collapsing in, may have over-rotated at the hips",
        StartingPosition.STANDING, PoseIntensity.BEGINNER, true, true, false,
        false);
    
    YogaPose warrior3 = new YogaPose("Warrior 3", 
        "From Mountain, arms extend overhead. Transfer weight onto standing leg (slight bend). "
        + "Extend back leg behind with toes touching the floor./"
        + "Hips stay square, create a straight line from head to back toes. Hinge forward from hips to bring body near horizontal."
        + "Gaze down, neck long. Lenghten through back heel.//"
        + "Regression: Arms at heart-center or in T shape.",
        StartingPosition.STANDING, PoseIntensity.INTERMEDIATE, true, false, false,
        false);
    
    YogaPose wideLeggedForwardFold = new YogaPose("Wide-Legged Forward Fold", 
        "From Warrior 2, extend front leg, shift toes to face long-edge of mat./"
        + "Place hands on hips, maintain neutral spine to hinge forward at the hips.//"
        + "Regression: Greater bend in knees; Progression: round back into forward fold.",
        StartingPosition.STANDING, PoseIntensity.BEGINNER, true, false, false,
        false);
    
    YogaPose twistingWideLeggedForwardFold = new YogaPose("Twisting Wide-Legged Forward Fold", 
        "Start in Wide-Legged Forward Fold./"
        + "Place L hand directly under nose (on ground or block). Twist towards the R, starting from the belly button. "
        + "Lift R arm to low back, or stretched above. Untwist and switch sides./"
        + "I twist, E untwist.",
        StartingPosition.STANDING, PoseIntensity.BEGINNER, true, false, false,
        false);
    
    YogaPose boat = new YogaPose("Boat", 
        "From seated, bend knees and place feet on the floor, holding back of the thighs with hands./"
        + "Lean torso back until abs start to engage. Float one foot off the ground, then the other. Balance. "
        + "Maintaing straight back, extend arms along the body.//"
        + "Regression: hold backs of thighs; feet stay on floor; Progression: legs extended.",
        StartingPosition.SEATED, PoseIntensity.INTERMEDIATE, false, true, false,
        false);
    
    YogaPose fourLimbedStaff = new YogaPose("Four-Limbed Staff", 
        "Start in plank./"
        + "Lower body as a unit, bending at the elbows, keeping the elbows tucked at the sides. "
        + "Hover parallel to the floor. Neck stays long, gaze down.//"
        + "Regression: start in a plank with knees on the floor.",
        StartingPosition.ALLFOURS, PoseIntensity.INTERMEDIATE, false, false, false,
        false);
    
    YogaPose star = new YogaPose("Star", 
        "Start in plank, center one hand under the chest./"
        + "Rotate body to the opposite side (rolling onto the outer edge of the foot), "
        + "reaching top hand upward. Lift top leg until in line with the corresponding hip. "
        + "Abs engaged to maintain straight line from bottom ankle to head. Avoid sinking at waist and hips. //"
        + "Regression: stack or stagger feet, or lower knee to the mat; perform on forearm.",
        StartingPosition.ALLFOURS, PoseIntensity.ADVANCED, true, false, false,
        false);
    
    YogaPose spineBalance = new YogaPose("Spine Balance", 
        "Start in all-fours./"
        + "Extend one arm forward and the opposite leg behind, creating a straight line from extended fingers and toes. "
        + "Hips parallel to the floor. Avoid arching in the back and sinking into the shoulder./"
        + "E extend arm, I crunch in (for dynamic spine balance)./"
        + "Regression: lift only arm or leg.",
        StartingPosition.ALLFOURS, PoseIntensity.INTERMEDIATE, true, true, false,
        false);
    
    YogaPose bridge = new YogaPose("Bridge", 
        "From lying down, bend at knees and place feet on mat with ankles under knees. Arms extended "
        + "along body with palms down./"
        + "Pressing through heels, tilt pelvis up to imprint the spine on the mat, lifting hips, then "
        + "lower back, middle back, and upper back -- creating a straight line from knees to shoulders. "
        + "Knees continue to point forward, avoiding rolling in or out./"
        + "I, E to lift; I, E to lower/"
        + "Progression: draw shoulders under with interlaced hands; continue to lift hips, creating an arch in the spine.",
        StartingPosition.PRONE, PoseIntensity.BEGINNER, false, true, false,
        false);
    
    YogaPose dolphin = new YogaPose("Dolphin", 
        "Start in plank with forearms on the floor./"
        + "Interlace fingers and rest sides of the forearms on the mat. Walk feet towards the hands as "
        + "we send the hips upward (maintaining a straight spine). Reach heels towards the floor.//"
        + "Regression: Bend knees to maintain neutral spine; Progression: lift one leg",
        StartingPosition.ALLFOURS, PoseIntensity.BEGINNER, false, false, false,
        false);
    
    YogaPose inclinedPlank = new YogaPose("Inclined Plank", 
        "From seated staff with feet pointed, place hands behind hips with fingertips forward./"
        + "Engage abs, glutes and hamstrings, lift hips off the mat, pressing heels into the floor "
        + "until straight line from shoulders to feet. Shoulders are stacked over hands. "
        + "If discomfort in neck, can tuck chin down towards chest//"
        + "Regression: if discomfort in wrists, make fists with hands; Progression: execute on forearms.",
        StartingPosition.SEATED, PoseIntensity.INTERMEDIATE, false, false, false,
        false);
    
    YogaPose locust = new YogaPose("Locust", 
        "From lying down, extend arms along side, palms facing inward. Toes pointed./"
        + "Engage abs, lifting chest, reaching through the crow of the head. Legs are down and pressed together. "
        + "Head in line with spine, shoulder blades together to engage upper back.//"
        + "Progression: use glutes and hamstrings to raise legs a few inches off the mat.",
        StartingPosition.PRONE, PoseIntensity.INTERMEDIATE, false, false, false,
        false);
    
    YogaPose modifiedBow = new YogaPose("Modified Bow", 
        "From lying down, extend arms along sides, palms facing inward./"
        + "Bring legs together, bending at the knees. Reach fingertips towards as ankles as we lift "
        + "the chest forward and lift knees off the floor. Head in line with spine//"
        + "Regression: if discomfort in hips, keep knees hip-width apart.",
        StartingPosition.PRONE, PoseIntensity.INTERMEDIATE, false, false, false,
        false);
    
    YogaPose modifiedCamel = new YogaPose("Modified Camel", 
        "Start in kneeling, stacking hips over the knees./"
        + "Press hips forward gently and place hands on lower back. Bring shoulder blades together, drawing the elbows back. "
        + "Lift chest upward, allowing the head to follow the curvature of the upper back. Avoid hinging "
        + "at lower back instead of extending upper back.//"
        + "Progression: Extend one arm up to the sky.",
        StartingPosition.ALLFOURS, PoseIntensity.BEGINNER, false, false, false,
        false);
    
    YogaPose modifiedShoulderStand = new YogaPose("Modified Shoulder Stand", 
        "From lying down, arms along sides and back of neck long./"
        + "Lift feet off the floor and bring knees toward the chest. Using strength of core, "
        + "lift hips off the mat and reach legs upward. Place hands on lower back for support "
        + "(without sinking weight of body onto the elbows). Point the toes, squeezing legs together. "
        + "Upper back stays on the floor.//"
        + "Progression: keep arms pressing down on the mat.",
        StartingPosition.SUPINE, PoseIntensity.ADVANCED, false, false, false,
        false);
    
    YogaPose tableTop = new YogaPose("Table Top", 
        "From seated staff, bend knees to plant feet. Place hands behind hips with fingertips forward./"
        + "Lift hips parallel to mat. Adjust hands and feet so hands are under shoulders and feet are under knees. "
        + "Avoid head dropping back.//"
        + "Progression: extend one leg at hips level",
        StartingPosition.SEATED, PoseIntensity.INTERMEDIATE, false, false, false,
        false);
    
    YogaPose upwardFacingDog = new YogaPose("Upward Facing Dog", 
        "From four-limbed staff, engage abs to support lower back./"
        + "Reach chest forward in a diagonal, straightening arms and rolling onto top of the feet. "
        + "Hands under shoulders, lift hips and knees of the floor. Shoulders away from ear, gaze forward. "
        + "Elongating spine and neck.//"
        + "Regression: knees on floor, maintain core engagement.",
        StartingPosition.ALLFOURS, PoseIntensity.INTERMEDIATE, false, false, false,
        false);
     
    // *Deep stretches*
    YogaPose childsPose = new YogaPose("Child's Pose", 
        "Sink glutes back towards heels./"
        + "Place forehead on the mat, bringing arms along sides. Shoulders relax towards the ground. "
        + "Widen knees outward as needed.//"
        + "Modifications: Arms extended in front of body; walk hands to the side; arm folded underneath body.",
        StartingPosition.ALLFOURS, PoseIntensity.BEGINNER, false, false, true,
        false);
    
    YogaPose cowFace = new YogaPose("Cow Face", 
        "From seated, bend knees and cross top leg over other leg, stacking the knees./"
        + "Draw feet towards opposite hips while keeping sit bones of the floor. Sit tall with neutral spine. "
        + "Bring [bottom leg side] arm overhead and bend at the elbow. Reach other arm behind and bend at elbow. "
        + "Clasp hands or use a strap or towel.//"
        + "Regression: hands at heart-center; Progression: lean forward and lay torso down on top leg.",
        StartingPosition.SEATED, PoseIntensity.BEGINNER, true, false, true,
        false);
    
    YogaPose cradleTheBaby = new YogaPose("Cradle the Baby", 
        "From staff, maintain a neutral spine and feet flexed./"
        + "Bring one foot in towards the chest, opening the knee to the side. "
        + "Hold the knee with the corresponding hand, and the ankle with the opposite hand. "
        + "Gently lift the leg towards the chest.//"
        + "Regression: slightly bend knee of extended leg; Progression: place knee and ankle of bent leg in crook of each elbow.",
        StartingPosition.SEATED, PoseIntensity.BEGINNER, true, false, true,
        false);
    
    YogaPose crossBeamGate = new YogaPose("Cross Beam/Gate", 
        "From a kneeling position with hips stacked over knees, extend one leg out to the side./"
        + "Rotate the leg outward so knee is pointing up (with slight bend). Point toes. "
        + "Extend arms at shoulder height and tilt torso to extended leg. "
        + "Reaching one arm towards the ankle and the other overhead (shoulder stays down).//"
        + "Variation: reach to opposite side, placing the opposite hand on the floor.",
        StartingPosition.ALLFOURS, PoseIntensity.BEGINNER, true, false, true,
        false);
    
    YogaPose pigeon = new YogaPose("Pigeon", 
        "From plank or downdog, bring one leg towards chest, placing the shin on the floor (foot under opposite hip)/"
        + "Hips square to the front, chest stays lifted, core engaged for hip flexor stretch. //"
        + "Progression: clasp hands behind, opening chest (avoid arching lower back); "
        + "walk upper body forward, folding over leg (increasing glutes stretch).",
        StartingPosition.ALLFOURS, PoseIntensity.BEGINNER, true, false, true,
        false);
    
    YogaPose seatedForwardFold = new YogaPose("Seated Forward Fold", 
        "From staff, lengthen the spine./"
        + "Walk hands down the legs while hinging at the hips. Stop when back begins to round. "
        + "Head stays in line with spine, maintain core engagement//"
        + "Regression: knees bent to maintain straight back; Progression: when unable to hinge anymore, "
        + "round back into a forward fold",
        StartingPosition.SEATED, PoseIntensity.BEGINNER, false, false, true,
        false);
    
    YogaPose supineSpinalTwist = new YogaPose("Supine Spinal Twist", 
        "From laying down, bring one knee in. /"
        + "Place opposite hand on the knee, pulling it across the body towards the ground. "
        + "Shoulders stay on the ground. Option to gaze in opposite direction of bent knee. //"
        + "Progression: extend top leg to find hamstring stretch and enhance spinal stretch.",
        StartingPosition.SUPINE, PoseIntensity.BEGINNER, true, false, true,
        false);
    
    YogaPose seatedTwist = new YogaPose("Seated Twist", 
        "From staff, bring one knee in towards the glute, placing the foot on the floor./"
        + "Maintaining neutral spine, twist up and out from the belly button toward the bent knee. "
        + "Hug knee with opposite elbow. Other hand plants behind near tailbone to help rotate./"
        + "I lift through spine, E twist deeper/"
        + "Regression: bend extended leg slightly to maintain straight spine; "
        + "Progression: hook the elbow outside the knee",
        StartingPosition.ALLFOURS, PoseIntensity.BEGINNER, true, false, true,
        false);
    
    // PILATES
    
    // *Warm up*
    Pilates lateralBreathing = new Pilates("Lateral breathing", 
        "From lying down, place hands on sides of ribcage, fingertips meeting in the middle./"
        + "Abs engaged, pulling navel to spine, expanding ribcage to the sides with each breath./"
        + "I feel the ribcage widening and fingertips separate, E notice the ribcage drawing inward.", 
        StartingPosition.SUPINE, PoseIntensity.BEGINNER, false, true);
    
    Pilates backBreathing = new Pilates("Back breathing", 
        "Sit on mat with feet planted./"
        + "Round back, allowing forehead to come towards knees. Abs engaged./"
        + "I expand middle and upper back (back of ribcage), E.", 
        StartingPosition.SEATED, PoseIntensity.BEGINNER, false, true);
    
    Pilates singleKneeLifts = new Pilates("Single Knee Lifts", 
        "From lying down, feet planted. Establish a neutral spine./"
        + "Engage abs, bring one knee towards the chest, stopping at 90 degree angle at the hip. "
        + "Lower the leg and continue to switch sides./"
        + "E knee in, I lower.", 
        StartingPosition.SUPINE, PoseIntensity.BEGINNER, false, true);
    
    Pilates singleLegExtension = new Pilates("Single Leg Extension", 
        "From lying down, feet planted close to glutes. Establish a neutral spine./"
        + "Abs engaged, sliding one foot down along the mat, extending the leg. Bring leg back to "
        + "starting position, switch sides./"
        + "I slide way, E slide in.", 
        StartingPosition.SUPINE, PoseIntensity.BEGINNER, false, true);
    
    Pilates toeTaps = new Pilates("Toe Taps", 
        "From lying down, feet planted. Establish a neutral spine. Bring one knee to 90 degrees at the hips, "
        + "then the other. Notice how the spine naturally imprints./"
        + "Lower one leg, moving from the hip and maintaing 90 degree. Tap the toes to the mat. "
        + "Lift back to starting position. Switch sides./"
        + "I lower, E lift.", 
        StartingPosition.SUPINE, PoseIntensity.BEGINNER, false, true);
    
    Pilates theHundred = new Pilates("The Hundred", 
        "From lying down, arms along sides, draw knees over hips (90 degree angle)./"
        + "Engage abs, lift head, neck, and shoulers off the mat, sending energy through fingertips."
        + " Slightly tuck chin. Notice how lower back imprints on the mat./"
        + "I pump arms up and down 5 times, E 5 more./"
        + "Regression: feet on floor; Progression: legs extended vertically or on a diagonal.", 
        StartingPosition.SUPINE, PoseIntensity.INTERMEDIATE, false, true);
    
    Pilates rollUp = new Pilates("Roll Up", 
        "From lying down, legs pressed together and feet flexed./"
        + "Engage abs, reach arms overhead with palms facing each other, thumbs a few inches off the mat. "
        + "Begin to roll up, lifting head and shoulders then upper back, middle back, lower back. "
        + "Moving vertebra by vertebra. Continue rolling until torso is vertical. Then roll spine forward, "
        + "avoiding hinging at the hips, arms reaching out past the toes. Reverse the movement./"
        + "I begin lift, E halfway, I begin lower, E fully lower./"
        + "Regression: bend knees if hamstrings are too tight.", 
        StartingPosition.SUPINE, PoseIntensity.INTERMEDIATE, false, true);
    
    // *Regular*
    Pilates singleLegCircles = new Pilates("Single Leg Circles", 
        "Lying flat, arms by sides. Activate core./"
        + "Lift one leg up to the ceiling, turned out with foot pointed. Elongate other leg along mat "
        + "with foot flexed. Draw small circle with top foot. Both hips stay grounded. "
        + "Reverse direction of movement. Switch legs./"
        + "I draw a half circle, E complete the circle./"
        + "Regression: bend bottom leg and plant the foot, can also bend top leg; Progression: draw bigger circles.", 
        StartingPosition.SUPINE, PoseIntensity.INTERMEDIATE, false, false);
    
    Pilates rollingLikeABall = new Pilates("Rolling Like a Ball", 
        "Sit tall with feet on mat, hip-width apart./"
        + "Place hands on shins, elbows wide. Curve spine into a C shape, tucking chin. Tip back "
        + "to balance on sit bones, bringing feet close to the buttocks, toes pointed. Engage core "
        + "and keep this shape to roll back until shoulder blades reach the mat, "
        + "then roll back up to starting position./"
        + "I roll back, E roll forward.", 
        StartingPosition.SEATED, PoseIntensity.INTERMEDIATE, false, false);
    
    Pilates singleLegStretch = new Pilates("Single Leg Stretch", 
        "Lying flat, draw knees to chest. Engage core to lift head, neck, and shoulders off the mat./"
        + "Extend one leg in a diagonal. Place [bent knee side] hand on bent knee and other hand on "
        + "the ankle. Switch sides./"
        + "I, E switch./"
        + "Regression: extend leg vertically; Progression: extend leg on lower diagonal, make sure lower "
        + "back stays connected to the mat.", 
        StartingPosition.SUPINE, PoseIntensity.INTERMEDIATE, false, false);
    
    Pilates doubleLegStretch = new Pilates("Double Leg Stretch", 
        "Lying flat, bring legs to chair position, toes pointed. Activate abs./"
        + "Lift head and shoulders off mat, reaching hands towards the ankles. Tuck chin towards chest. "
        + "Extend legs out in a diagonal as arms extend overhead in a diagonal. Bring legs back to starting position "
        + "as circle arms to reach towards the ankles./"
        + "I extend, E back to starting position./"
        + "Regression: extend legs up vertically; Progression: extend arms and legs on a lower diagonal.", 
        StartingPosition.SUPINE, PoseIntensity.INTERMEDIATE, false, false);
    
    Pilates singleStraightLegStretch = new Pilates("Single Straight Leg Stretch", 
        "Lying flat, draw knees to chest. Engage core to lift head, neck, and shoulders off the mat./"
        + "Extend both legs long. Reach towards one ankle with both hands while stretching the other leg "
        + "down. Elbows wide./"
        + "I right left, E right left./"
        + "Regression: knees bend slightly, hold back of calf.", 
        StartingPosition.SUPINE, PoseIntensity.INTERMEDIATE, false, false);
    
    Pilates doubleStraightLegStretch = new Pilates("Double Straight Leg Stretch", 
        "Lying flat, draw knees to chest. Place hands behind head, elbows wide. "
        + "Engage core to lift head, neck, and shoulders off the mat./"
        + "Extend both legs long, heels together, feet pointed, legs turned out. "
        + "Lower both legs a few inches, then lift back up./"
        + "I lower, E lift./"
        + "Regression: knees bend slightly.", 
        StartingPosition.SUPINE, PoseIntensity.INTERMEDIATE, false, false);
    
    Pilates crissCross = new Pilates("Criss Cross", 
        "Lying flat, draw knees to chair position. Place hands behind head, elbows wide. "
        + "Engage core to lift head, neck, and shoulders off the mat./"
        + "Twist R, extending L leg in a diagonal, looking beyond R elbow which stays off the mat. "
        + "Return to starting position. Switch sides./"
        + "I twist, E return to starting position./"
        + "Regression: extend leg up vertically; Progression: extend leg on a lower diagonal, making "
        + "sure lower back remains imprinted.", 
        StartingPosition.SUPINE, PoseIntensity.INTERMEDIATE, false, false);
    
    Pilates spineStretch = new Pilates("Spine Stretch", 
        "Sit tall with legs hip-width apart, feet flexed./"
        + "Arms extend at shoulder heigh, palms down. Imagine sitting against a wall. Pull navel to spine "
        + "and begin rounding the spine forward one vertebra at a time, starting with the head, continue "
        + "with upper back, then lower back. Avoid hinging at the hips, only articulating through the spine. "
        + "Arms stay at shoulder height. Reverse the motion, stacking each vertebra./"
        + "E roll forward, I reverse the motion./"
        + "Regression: knees bent.", 
        StartingPosition.SEATED, PoseIntensity.INTERMEDIATE, false, false);
    
    Pilates openLegRocker = new Pilates("Open Leg Rocker", 
        "Sitting, open knees and bring feet towards glutes./"
        + "Grab ankles and tilt back to balance between sit bones and tailbone while maintaing a flat back. "
        + "Extend both legs, slightly wider than shoulder-width. Curl tailbone under, rounding the back to "
        + "roll back onto shoulder blades. Reverse to return to starting position./"
        + "I roll back, E return./"
        + "Regression: bend knees.", 
        StartingPosition.SEATED, PoseIntensity.ADVANCED, false, false);
    
    Pilates corkScrew = new Pilates("Corkscrew", 
        "Lying flat, extend legs to the ceiling in Pilates stance./"
        + "Legs move together, drawing a circle. Reverse direction each time. Shoulders and hips stay squared on mat./"
        + "I half circle, E complete the circle./"
        + "Regression: bend knees, draw circles with the knees.", 
        StartingPosition.SUPINE, PoseIntensity.INTERMEDIATE, false, false);
    
    Pilates theSaw = new Pilates("The Saw", 
        "Sit tall with legs wider than hip-width apart, feet flexed./"
        + "Arms extend to the sides at shoulder height. Draw navel to spine and twist up and out to the side, "
        + "starting at the belly button, spiraling up to the head. Round forward one vertebra at a time, "
        + "reaching little finger to little tow. Gaze can come to back hand. Reverse motion./"
        + "E twist and roll forward, I reverse the motion./"
        + "Regression: knees bent.", 
        StartingPosition.SEATED, PoseIntensity.INTERMEDIATE, false, false);
    
    Pilates swanPreparation = new Pilates("Swan Preparation", 
        "Lying face-down, feet pointed, place hands under shoulders with fingers forward./"
        + "Draw navel to spine, engage upper back muscles to lift chest up and foward in a diagonal. "
        + "Arms assist and partially straighten as shoulders slide back towards hips.//"
        + "Regression: if lower back discomfort, keep elbows on mat while lifting.", 
        StartingPosition.PRONE, PoseIntensity.INTERMEDIATE, false, false);
    
    Pilates singleLegKick = new Pilates("Single Leg Kick", 
        "Lying face-down, elbows are shoulder-width with forearms pressing into the mat. "
        + "Legs zipped together, toes pointed./"
        + "Lift the sternum while pressing shoulders down and back. Engage core to pull navel off the mat, "
        + "creating a long line from tailbone to head, avoiding arching lower back. Bend at one knee "
        + "with a double beat (point, then flex foot) into the glutes. Lower leg. Switch sides./"
        + "E kick, I lower./"
        + "Regression: forehead rests on back of the hands.", 
        StartingPosition.PRONE, PoseIntensity.INTERMEDIATE, false, false);
    
    Pilates doubleLegKick = new Pilates("Double Leg Kick", 
        "Lying face-down, head to one side. Hands resting on lower back with palms up. "
        + "Legs zipped together, toes pointed./"
        + "Bend both knees, kicking towards glutes for 3 quick pulses (hips stay grounded). "
        + "Straighten arms and legs, lifting upper body on a diagonal, head in line with spine, feet on the mat. "
        + "Lower body to the mat as return to starting position, head to other side./"
        + "E bend and kick, I extend upper body.", 
        StartingPosition.PRONE, PoseIntensity.INTERMEDIATE, false, false);
    
    Pilates neckPull = new Pilates("Neck Pull", 
        "Lying flat, hands behind head, elbows wide. Legs hip-width with feet flexed./"
        + "Begin to roll up one vertebra at a time, lifting head and shoulders first. Continue until "
        + "tall seated position. Start to hinge back at hips with flat back as far as possible. Then "
        + "roll down by rounding back into the mat./"
        + "I roll up, E half-way through rolling up. I at tall seated, E roll down./"
        + "Regression: place arms along legs to help crawl up; legs slightly bent.", 
        StartingPosition.SUPINE, PoseIntensity.INTERMEDIATE, false, false);
    
    Pilates spineTwist = new Pilates("Spine Twist", 
        "Sitting tall, legs zipped together with feet flexed. Arms extend to sides at shoulder height with palms down./"
        + "Rotate torso to side with a double pulse. Return to center. Switch sides. "
        + "Sit and lift taller with each twist./"
        + "E rotate, I return to center./"
        + "Regression: bend knees.", 
        StartingPosition.SEATED, PoseIntensity.INTERMEDIATE, false, false);
    
    Pilates shoulderBridge = new Pilates("Shoulder Bridge", 
        "Lying flat, feet planted under knees, hip-width distance apart. Arms along sides, palms down./"
        + "Press through heels to tuck pelvis under, lifting one vertebra at a time until "
        + "creating a straight line from knees to shoulders. Knees point forward./"
        + "Full breath roll up, full breath to roll down.", 
        StartingPosition.SUPINE, PoseIntensity.INTERMEDIATE, false, false);
    
    Pilates sideKicksPrep = new Pilates("Side Kicks Prep", 
        "Lying sideways, align body to back edge of mat, hips and shoulders stacked. "
        + "Engage core to maintain straight spine./"
        + "Prop head up on one hand, other hand plants in front of torso. Shift legs forward, creating a "
        + "banana shape with the body. Legs turn out, heels together, bottom foot flexed, top pointed.", 
        StartingPosition.SIDE, PoseIntensity.INTERMEDIATE, true, false);
    
    Pilates sideKicksFront = new Pilates("Side Kicks: Front", 
        "Start in Side Kicks Prep position./"
        + "Lift top leg to hip height, parallel to the floor. Move leg forward with toes pointed, "
        + "then back to starting position with foot flexed. "
        + "Rest of the body stays in same alignment. Avoid rounding of torso as leg moves./"
        + "I move leg forward, E move leg back./"
        + "Progression: Can move leg back slightly behind the body. Engage core to prevent lower back arching.", 
        StartingPosition.SIDE, PoseIntensity.INTERMEDIATE, true, false);
    
    Pilates sideKicksUpDown = new Pilates("Side Kicks: Up & Down", 
        "Start in Side Kicks Prep position./"
        + "Rotate top leg out so knee faces the ceiling. Lift leg up with toes pointed, avoid sinking in waist. "
        + "Lead down with heel, foot flexed, back to starting position. Hips stay square to front./"
        + "I leg up, E leg down.", 
        StartingPosition.SIDE, PoseIntensity.INTERMEDIATE, true, false);
    
    Pilates teaser = new Pilates("Teaser", 
        "Lie flat on mat with legs in chair position, arms overhead./"
        + "Extend legs in a diagonal, rotating out into Pilates stance. Raise arms, heads and shoulders "
        + "off the mat vertebra by vertebra, keeping the legs stationary. Arms continue to move until "
        + "parallel with the legs, creating a V shape with the body. Reverse movement to lower body./"
        + "I halfway up, E to fully lift. I and E to fully lower./"
        + "Regression: Perform with one leg bent, foot planted on the mat; bend knees slightly; "
        + "Progression: start with legs extended on mat, lift legs and torso at same time.", 
        StartingPosition.SUPINE, PoseIntensity.ADVANCED, false, false);
    
    Pilates swimming = new Pilates("Swimming", 
        "Lie face down, arms extended in front. Abs engaged. Legs zipped together with feet flexed./"
        + "Imagine reaching hands and toes in opposite dirrections as lift a few inches off the floor. "
        + "Head stays in line with spine. Flutter arms and legs in a swimming motion. Anchor hips on the mat.//"
        + "Regression: only lift one arm and leg at a time; perform swimming motion with only legs or only arms.", 
        StartingPosition.PRONE, PoseIntensity.INTERMEDIATE, false, false);
    
    Pilates seal = new Pilates("Seal", 
        "Start seated with legs drawn in. Wrap hands around outside of the heels./"
        + "Create a C shape with the spine, tilting back to lift feet off the mat, balancing on sit bones. "
        + "Roll back onto shoulder blades, clapping heels 3 times. Then roll back to starting position./"
        + "I roll back, I roll forward./"
        + "Regression: perform with the claps", 
        StartingPosition.SEATED, PoseIntensity.INTERMEDIATE, false, false);
    
    Pilates kneelingSideKick = new Pilates("Kneeling Side Kick", 
        "Start kneeling on mat with hips over knees. Place one hand on mat directly underneath the shoulder, "
        + "the other hand behind the head. Avoid sinking into the shoulder./"
        + "Lift top leg to hip height, toes pointed. Without moving rest of body, move leg forward, then "
        + "slightly back. Avoid using momentum./"
        + "I move leg forward, E move leg back./"
        + "Regression: place top hand on hip.", 
        StartingPosition.ALLFOURS, PoseIntensity.INTERMEDIATE, true, false);
    
    Pilates legPullDown = new Pilates("Leg Pull Down", 
        "Start in plank with legs pressed together./"
        + "Lift one foot off the floor to hip height, lengthening through the leg. Avoid shifting body weight. "
        + "Shift weight forward, then back, reaching the opposite heel to the floor. Continue to rock "
        + "forward and back. Switch legs./"
        + "I shift forward, E shift back./"
        + "Regression: hold plank without rocking, or rock back and forth with both feet on the floor; "
        + "perform on forearms.", 
        StartingPosition.ALLFOURS, PoseIntensity.INTERMEDIATE, false, false);
    
    Pilates legPullUp = new Pilates("Leg Pull Up", 
        "Find inclined plank position with legs pressed together, hands under shoulders. Gaze ahead./"
        + "Lift one leg up to hip height, lower leg. Switch sides. Avoid sinking in hips. Shoulders away from ears./"
        + "I lift, E lower./"
        + "Regression: do not lift legs.", 
        StartingPosition.SEATED, PoseIntensity.INTERMEDIATE, false, false);
    
    // MEDITATION
    
    // *Mindfulness*
    Mindfulness breathAndBody = new Mindfulness("Breath and body", 
        "-comfortable seat, hands rest on knees, palms facing up\n"
        + "-spine lengthening\n"
        + "-soft gaze, close eyes\n"
        + "*breath*\n"
        + "-focusing on breath, I & E\n"
        + "-natural pace\n"
        + "-rise & fall of chest\n"
        + "-cool air → warm air\n"
        + "-elongate each breath\n"
        + "trans: letting go of tension with each E\n"
        + "*body*\n"
        + "-noticing sensation in legs\n"
        + "-sit bones grounding\n"
        + "-noticing spine length\n"
        + "-shoulders away from ears\n"
        + "-relaxing jaw\n"
        + "-softening forehead\n"
        + "attention back to room\n");
    
    Mindfulness bodyAwareness = new Mindfulness("Body awareness", 
        "-comfortable seat, hands rest on knees, palms facing up\n"
        + "-spine lengthening\n"
        + "-soft gaze, close eyes\n"
        + "-focusing on breath, I & E\n"
        + "trans: letting go of tension with each E\n"
        + "*body scan*\n"
        + "-noticing sensation in soles of feet, through the legs\n"
        + "-feel points of contact with the mat\n"
        + "-sit bones grounding\n"
        + "-notice any tension or relaxation in the lower back, in the abdomen\n"
        + "-observing the rise and fall of the breath\n"
        + "-upper back and chest\n"
        + "-noticing spine length\n"
        + "-shoulders, forearms, wrists, elbows\n"
        + "-up through neck, jaw, face, forehead\n"
        + "-awareness to entire body as a whole");
    
    Mindfulness intentionSetting = new Mindfulness("Intention setting", 
        "-breath awareness\n"
        + "-body grounding\n"
        + "-noticing our body, using this awareness to set an intention for class today\n"
        + "-it can be a word or phrase: strength, calm, balance, gratitude");
    
    // *Relaxation*
    Relaxation releaseTension = new Relaxation("Releasing tension", 
        "-*noticing breath, awareness to areas of tension in body (after class, movement)*\n"
        + "-practicing tensing and releasing *down the body*: tense muscles in face, release…"
        + "-bring shoulders to ears, release… Engage arms, extending straight, creating fists, release… *whole body*\n"
        + "-*after all the way down* noticing the release through our whole body, embracing the feeling of release\n"
        + "-*pause* with each breath, noticing our body sink deeper and deeper into the support of the floor.\n"
        + "-now, letting our mind relax deeper. Letting go, completely. *pause*\n"
        + "-if we notice our mind wandering, guiding our focus back to our breath.\n"
        + "-*pause*\n"
        + "-bringing our awareness back to the room around us:\n"
        + "the touch of our body on the mat, the music from the speakers, perhaps even the sound of our own breath…\n"
        + "-gently wiggling fingers and toes…");
    
    Relaxation softeningBody = new Relaxation("Softening body + breath", 
        "-as we settle into our final relaxation, melting the weight of our body into the support of the floor…\n"
        + "-noticing how our body makes contact with the mat.\n"
        + "-*pause* releasing the back of our legs… hips… lower back, middle back and upper back…\n"
        + "-softening the back of our shoulders… arms… neck… and the back of our head.\n"
        + "-making any adjustments we need to relax the body into the ground more fully. *pause*\n"
        + "-softening the muscles in our face… relaxing our eyes and forehead… relaxing our mouth and jaw.\n"
        + "-allowing our whole face to soften. *pause*\n"
        + "-*transition to breath grounding*: noticing what we notice, noticing breath, noticing rise and fall of belly\n"
        + "-placing our hands on our belly. feeling the rise and fall of our belly as we breathe.\n"
        + "-*pause* noticing each inhalation as it enters the body, and each exhalation as it exits the body.\n"
        + "-*pause* allowing our breathing to be soft, full and easy. *pause*\n"
        + "*transition out*\n");
    
    Relaxation noticingBody = new Relaxation("Noticing breath + body scan", 
        "-breathing, grounding, closing eyes\n"
        + "-noticing changes in breath from beginning of class\n"
        + "-if notice thoughts, bring focus back to breath\n"
        + "-check in with body, starting at the crown of head\n"
        + "  -shoulders, down arms\n"
        + "  -rise and fall of chest and belly\n"
        + "  -hips\n"
        + "  -throught legs to feet\n"
        + "-wiggle fingers and toes... transition out");
    
    Relaxation warmthVisualization = new Relaxation("Warmth visualization", 
        "-breath, close eyes\n"
        + "-observe each I, E flowing through body\n"
        + "-rise and fall of chest\n"
        + "-back of body warmth as it rests on floor\n"
        + "  -allow this sensation to rise to front of body\n"
        + "-soften face, front of neck, chest, tops of shoulders, arms to fingertips\n"
        + "-abdomen softens as rise and fall with breath\n"
        + "-tops of thighs soften\n"
        + "-softening sensation flows down to tips of toes\n"
        + "-relaxed sensation gliding from toes up through crown of head\n"
        + "-imagine a wave, drifting over body, releasing any remaining tension\n"
        + "-taking a few moments alone in silence, softening with each breath");
    
    Relaxation guidedImagery = new Relaxation("Guided Imagery", 
        "-breath, release tension\n"
        + "-choose a setting or image in which we feel at peace, real or imagined\n"
        + "  --> tropical beach, a favorite childhood spot, a quiet garden\n"
        + "-imagine what this place is like, allowing us to relax, find calm\n"
        + "-are we in a more quiet place, or is it bustling?\n"
        + "-are we alone? with someone else?\n"
        + "-noticing the relaxing sounds we hear\n"
        + "-the colors, shapes, and objects that make our place calming\n"
        + "-how does the ground feel below us? smooth or textured?\n"
        + "-what do we smell?\n"
        + "-how does the air feel on our skin?\n"
        + "-picturing ourselves in this place where we can enjoy just being\n"
        + "-few moments in silence, transition out");
    
  }

}
